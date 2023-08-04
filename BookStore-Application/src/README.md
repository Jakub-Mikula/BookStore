Spring Boot Bookshop

Endpoints:
###api/authentication/sign-up
POST /api/authentication/sign-up HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Content-Length: 77

{
"name" : "herA",
"username" : "herA",
"password" : "user"
}


###api/authentication/sign-in
POST /api/authentication/sign-in HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Content-Length: 55

{
"username" : "herA",
"password" : "user"
}