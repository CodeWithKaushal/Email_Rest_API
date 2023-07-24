# Email_Rest_API


# Email REST API using Spring Boot

This repository contains a simple implementation of a RESTful API for sending emails using Spring Boot. The API is designed to provide a straightforward way to integrate email sending functionality into your applications. It utilizes Spring Boot to create a robust and easily maintainable email service.

## Features

- Send plain text and HTML emails.
- Support for attachments in emails.

## Prerequisites

- Java Development Kit (JDK) 11 or higher.
- Apache Maven for building the project.
- An SMTP server for sending emails. (You can use a local or external SMTP server.)

## Setup

1. Clone the repository:

```bash

git clone https://github.com/CodeWithKaushal/Email_Rest_API.git
cd email-rest-api-send
```

2. Configure the SMTP server settings:

Open the `application.properties` file and provide the necessary configuration for your SMTP server. Update the following properties with your SMTP server details:

```properties
spring.mail.host=your-smtp-host
spring.mail.port=your-smtp-port
spring.mail.username=your-smtp-username
spring.mail.password=your-smtp-password
```

3. Build the project:

```bash
mvn clean package
```

4. Run the application:

```bash
java -jar target/email-api-send-1.0.0.jar
```

The API will be accessible at `http://localhost:8080`.

## API Endpoint

### Send an Email

**Endpoint:** `POST /api/email/send`

**Request Body:**

```json
{
  "to": "kaushal@gmail.com",
  "subject": "Your Subject",
  "message": "Hello, this is the email body."
}
```

### Send an Email with Attachments

**Endpoint:** `POST /api/email/send`

**Request Body:**

```json
{
  "to": "kaushal@gmail.com",
  "subject": "Your Subject",
  "message": "Hello, this is the email body.",
  "attachments": [
    {
      "name": "file.txt",
      "content": "SGVsbG8sIHdvcmxkIQ=="
    }
  ]
}
```



## Acknowledgments

We would like to express our gratitude to the Spring Boot community for providing such an excellent framework.

If you encounter any issues or have suggestions for improvements, please open an issue or submit a pull request. Thank you for your contributions!

---
Output:
![Screenshot (13)](https://github.com/CodeWithKaushal/Email_Rest_API/assets/101656305/bee7a264-d10e-4f60-8276-a400e9124db7)


![Screenshot (14)](https://github.com/CodeWithKaushal/Email_Rest_API/assets/101656305/ff8428ec-66d3-4f0b-932f-c7c8b3c27464)




![gm](https://github.com/CodeWithKaushal/Email_Rest_API/assets/101656305/9edc5ea7-0a4c-46a1-97a6-afd619c4ef43)

