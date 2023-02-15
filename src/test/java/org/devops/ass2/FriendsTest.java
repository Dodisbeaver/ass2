package org.devops.ass2;

import static org.junit.Assert.*;

import org.junit.Test;

public class FriendsTest {
	//This is a positive test. Testing if the returned value is correct.
    @Test
    public void testGetFriendsWithValidLink() {
        String[] expectedFriends = {"Stefan", "Itti", "Johan", "Mats"};
        assertArrayEquals(expectedFriends, FacebookFriends.facebookFriends("https://www.facebook.com/valid-link"));
    }
    // This is a negative test. Testing for invalid links
    @Test
    public void testGetFriendsWithInvalidLink() {
        String[] expectedFriends = {};
        assertArrayEquals(expectedFriends, FacebookFriends.facebookFriends("https://www.facebook.com/invalid-link"));
    }
    // This tests if a null link is passed to the function and expects nothing in return
    @Test
    public void testGetFriendsWithNullLink() {
        String[] expectedFriends = {};
        assertArrayEquals(expectedFriends, FacebookFriends.facebookFriends(null));
    }
    // This test tests for empty links
    @Test
    public void testGetFriendsWithEmptyLink() {
        String[] expectedFriends = {};
        assertArrayEquals(expectedFriends, FacebookFriends.facebookFriends(""));
    }
    // This tests for links to non facebook pages
    @Test
    public void testGetFriendsWithNonFacebookLink() {
        String[] expectedFriends = {};
        assertArrayEquals(expectedFriends, FacebookFriends.facebookFriends("https://www.google.com"));
    }

}
