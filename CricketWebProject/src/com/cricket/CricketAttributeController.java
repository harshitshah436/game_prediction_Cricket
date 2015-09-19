package com.cricket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

import weka.classifiers.Classifier;
import weka.core.Instances;

@Controller
public class CricketAttributeController {

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView student() {
		return new ModelAndView("home", "command", new CricketAttribute());
	}

	@RequestMapping(value = "/dislayPrediction", method = RequestMethod.POST)
	public String dislayPrediction(
			@ModelAttribute("IsCricketWeb") CricketAttribute cricketAttribute,
			ModelMap model) throws Exception {

		cricketAttribute
				.setResult(predictFromTrainedWekaModel(cricketAttribute));

		model.addAttribute("toss_won", cricketAttribute.getToss_won());
		model.addAttribute("day_night", cricketAttribute.getDay_night());
		model.addAttribute("home_advantage",
				cricketAttribute.getHome_advantage());
		model.addAttribute("first_bat", cricketAttribute.getFirst_bat());
		model.addAttribute("weather", cricketAttribute.getWeather());
		model.addAttribute("run_target", cricketAttribute.getRun_target());
		model.addAttribute("top_score", cricketAttribute.getTop_score());
		model.addAttribute("top_partnership",
				cricketAttribute.getTop_partnership());
		model.addAttribute("result", cricketAttribute.getResult());

		return "result";
	}

	public String predictFromTrainedWekaModel(CricketAttribute cricketAttribute)
			throws Exception {
		
		System.out.println(new File(".").getAbsolutePath());
		System.out.println(new File(".").getCanonicalPath());

		String physicalPath = "/Users/";

		Classifier cls = (Classifier) weka.core.SerializationHelper
				.read(physicalPath + "IndvPakTrainedModel.model");

		MakeARFFFile(cricketAttribute);

		Instances isntanceToPredict = new Instances(new BufferedReader(
				new FileReader(physicalPath + "test_data.arff"))); // load or
																	// create
																	// Instances
		// to predict

		// which instance to predict class value
		int s1 = 0;

		isntanceToPredict.setClassIndex(0);

		// perform your prediction
		double value = cls.classifyInstance(isntanceToPredict.instance(s1));

		// get the name of the class value
		String prediction = isntanceToPredict.classAttribute().value(
				(int) value);

		System.out.println("The predicted value of instance "
				+ Integer.toString(s1) + ": " + prediction);

		return prediction;
	}

	public void MakeARFFFile(CricketAttribute cricketAttribute)
			throws IOException {
		String physicalPath = "/Users/";
		FileWriter fw = new FileWriter(
				new File(physicalPath + "test_data.arff"));
		BufferedWriter bw = new BufferedWriter(fw);

		String relation = "'India_vs_Pakistan-weka.filters.unsupervised.attribute.Remove-R1,9-11,13,15-26'";
		String attribute1 = "@attribute result {India,Pak}";
		String attribute2 = "@attribute toss_won {India,Pak}";
		String attribute3 = "@attribute day_night {No,Yes}";
		String attribute4 = "@attribute home_advantage {Pak,India}";
		String attribute5 = "@attribute first_bat {Pak,India}";
		String attribute6 = "@attribute weather {sunny,overcast,windy}";
		String attribute7 = "@attribute run_target numeric";
		String attribute8 = "@attribute top_score numeric";
		String attribute9 = "@attribute top_partnership numeric";

		bw.write("@relation " + relation);
		bw.newLine();
		bw.newLine();

		bw.write(attribute1);
		bw.newLine();
		bw.write(attribute2);
		bw.newLine();
		bw.write(attribute3);
		bw.newLine();
		bw.write(attribute4);
		bw.newLine();
		bw.write(attribute5);
		bw.newLine();
		bw.write(attribute6);
		bw.newLine();
		bw.write(attribute7);
		bw.newLine();
		bw.write(attribute8);
		bw.newLine();
		bw.write(attribute9);
		bw.newLine();
		bw.newLine();

		bw.write("@data");
		bw.newLine();
		bw.write("India," + cricketAttribute.getToss_won() + ","
				+ cricketAttribute.getDay_night() + ","
				+ cricketAttribute.getHome_advantage() + ","
				+ cricketAttribute.getFirst_bat() + ","
				+ cricketAttribute.getWeather() + ","
				+ cricketAttribute.getRun_target() + ","
				+ cricketAttribute.getTop_score() + ","
				+ cricketAttribute.getTop_partnership());

		bw.close();
		fw.close();
	}
}