# Instagram

1. Language and Framwork - Java , SpringBoot , JPA , MYSQL database , Swagger UI
   
2. Data Flow
   - Controller (API)
     a. PostController - getPostById(), createPost()
     b. UserController) - signUpUser(), signInUser(), signOutUser()
   - Service
     a. Post - getPostById(), createPost()
     b. User - signUpUser(), signInUser(), signOutUser()
     c. authenticationService - authenticate(), saveAuthToken(), findFirstByUser(), removeToken()
     d. utility - EmailUtility(), HashingUtility()

3. Model - Post(), User(), AuthenticationToken(), SignUpOutput(), SignInInput()

4. Repository - IAuthTokenRepo(), IPostRepo(), IOrderRepo()

5. Data Structure Used - MYSQL as database

6. Project Summary

Practicing mapping, APis, SignIn, and SignUp on Instagram Backend is part of this assignment. Springboot allows you to create Post and get Post by Id.

7. Features for Employee

- Create /SignUp user
- SignIn user(Send token on mail for verification)
- SignOut user (Delete token)
- Create Post (Create the Post using email and token and post link)
- Get post by id(get the specific post by providin email, token and post id)
