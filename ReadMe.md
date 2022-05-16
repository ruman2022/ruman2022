## Verify user can’t log in with incorrect credentials and view validation error messages

Step 1. 
	User can navigate to https://rx-devtest.com/

Expected Results:
	Verify DevTest Home page displays successfully

Step 2. 
	Click on Sign in button from the top left conner of the page

Expected Results:
	User is on Sign In page

Step 3. 
	Enter an invalid email and invalid password and click Sign In

Expected Results:
	Verify User can see the error message “email or password is invalid”

Step 4. 
	Enter a valid email and invalid password and click Sign In

Expected Results:
	Verify User can see the error message “email or password is invalid”

Step 5. 
	Enter an invalid email and valid password and click Sign In

Expected Results:
	Verify User can see the error message “email or password is invalid”

Step 6. 
	Enter a valid email and leave the password field blank and click Sign In

Expected Results:
	Verify User can see the error message “password can't be blank”

Step 7. 
	Enter a password and leave the email field blank and click Sign In

Expected Results:
	Verify User can see the error message “email can't be blank”

Step 7. 
	Enter a valid email and invalid password and click Sign In
Expected Results:
	Verify user should be on” https://rx-devtest.com/”


Step 8. 
	Close the application

Expected Results:
	Verify that application closed successfully	

-------------------------------------------

## Verify user can successfully login
##### Pre-req: User has valid credentials to sign-in to DevTest
Step 1. 
	User can navigate to https://rx-devtest.com/

Expected Results:
	Verify DevTest Home page displays successfully

Step 2. 
	Click on Sign in button from the top left conner of the page

Expected Results:
	User is on Sign In page

Step 3. 
	User can navigate to Sign-Up page by click “Need an account?” hyperlink

Expected Results:
	Verify upon clicking “Need an account?” hyperlink, user can go to Sign-up page.

Step 4.
	Go back to Sign In page and verify placeholder text

Expected Results:
	User can see placeholder text “Email” and “Password” 

Step 5.
	Enter a valid Email and Password and click Sign In.

Expected Results:
	Verify user is signed in successfully. 

Step 6. 
	Close the application

Expected Results:
	Verify that application closed successfully	

--------------------------------------------------------------------------------------------

## Verify user can post a New Article
#### Pre-req: User has valid credentials to sign-in to DevTest
Step 1. 
•	User can navigate to https://rx-devtest.com/
•	Click on Sign in button from the top left conner of the page
•	On the Sign-In page, enter valid credential and click sign-in

Expected Results:
	Verify user is successfully sign into DevTest

Step 2. 
	Click on ‘New Article’

Expected Results:
	Verify user is directed to Post Editor page

Step 3. 
	User can see the below placeholder text
•	Article Title <br>
•	What's this article about? <br>
•	Write your article (in markdown) <br>
•	Enter tags <br>

Expected Results:
	All placeholder text is displayed as expected 

Step 4. 
	Enter the blow text for field

•	In Article Title: Test Post <br>
•	In What's this article about?: This is an example subject for test purpose only <br>
•	In Write your article (in markdown): <br>
o	## test markdown article body <br>
o	–  Line 1 <br>
o	>  Line 2 <br>
o	[Link] – any link <br>
•	Enter tags: welcome <br>

Click on Sign-in button



Expected Results:
	Verify user can successfully post new article  


Step 6. 
	Close the application

Expected Results:
	Verify that application closed successfully



	
	

