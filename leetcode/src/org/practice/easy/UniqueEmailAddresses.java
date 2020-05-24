package org.practice.easy;

import java.util.HashSet;
//This solution is incorrect
public class UniqueEmailAddresses {
	
	public int numUniqueEmails(String[] emails) {
    
		HashSet<String> set = new HashSet<>();
		
		for (String email : emails) {
			StringBuilder sb = new StringBuilder();			
			for(int i = 0; i < email.length(); i++) {
				char c = email.charAt(i);
				if (c == '.')
					continue;
				else if (c == '+') {
					while(email.charAt(i) != '@')
						i++;
					
					sb.append(email.substring(i + 1));
				}
				else sb.append(c);
			}
			set.add(sb.toString());
		}
		return set.size();
    }

	public static void main(String[] args) {
		
		UniqueEmailAddresses obj = new UniqueEmailAddresses();
		
		String emails[] = {"test.email+alex@leetcode.com",
							"test.e.mail+bob.cathy@leetcode.com",
							"testemail+david@lee.tcode.com"};
		
		System.out.println(obj.numUniqueEmails(emails));

	}

}
