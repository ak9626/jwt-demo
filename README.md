# jwt-demo

Test the auth endpoint first:
GET http://localhost:8080/auth/test
This should return "Auth endpoint is working"

Then try login:

POST http://localhost:8080/auth/login
Body (x-www-form-urlencoded):

username: admin
password: password

You should get a response with a token.

Finally test the protected endpoint:

CopyGET http://localhost:8080/test
Headers:
Authorization: Bearer your_token_here

You will get the message:
If you see this, you are authenticated!
