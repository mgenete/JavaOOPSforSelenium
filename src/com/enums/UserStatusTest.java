package com.enums;

public class UserStatusTest {

	public static void main(String[] args) {

		System.out.println(UserStatus.ACTIVE);
		System.out.println(UserStatus.PENDING);
		
		for (UserStatus status : UserStatus.values()) {
            System.out.println(status);
        }
	}

}
