package com.exam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Exam {




		/**
		 * @param args
		 */
		public static void main(String[] args) {
			//Validate INput argument is empty or not 
			if (args.length == 0) {
				System.err.println("Please provide your input");
				System.exit(1);
			}
			Map<String, Integer> valueMap = new LinkedHashMap<String, Integer>();
			for (String input : args) {
				//Split each  value by comma separator
				String[] valueArray = input.split(",");
				//Check if key is already available in map
				if (valueMap.containsKey(valueArray[0])) {
					int existingValue = valueMap.get(valueArray[0]);
					valueMap.put(valueArray[0],
							existingValue + Integer.parseInt(valueArray[1]));
				} else {
					valueMap.put(valueArray[0], Integer.parseInt(valueArray[1]));
				}
			}
			for (Entry<String, Integer> entry : valueMap.entrySet()) {
				System.out.println(entry.getKey() + "," + entry.getValue());
			}
		}
	}

