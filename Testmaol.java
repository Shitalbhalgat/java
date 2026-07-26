//Step 1: Required JARs
//
//Download and add these JARs to:
//
//WebContent
//   └── WEB-INF
//         └── lib
//jakarta.mail-2.0.3.jar
//jakarta.activation-api-2.1.3.jar
//angus-activation-2.0.2.jar

import java.util.Properties;
import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

public class Testmaol {

    public static void main(String[] args) {
        // 1. Configure configuration details
        String smtpHost = "smtp.gmail.com"; // Replace with your SMTP server host
        String smtpPort = "587";            // TLS Port (Use 465 for SSL)
        
        final String senderEmail = "your-email@gmail.com"; 
        final String appPassword = "your-app-password"; // Use a unique App Password
        String recipientEmail = "receiver-email@gmail.com";

        // 2. Set SMTP server properties
        Properties properties = new Properties();
        properties.put("mail.smtp.host", smtpHost);
        properties.put("mail.smtp.port", smtpPort);
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true"); // Enable TLS security

        // 3. Create a session with authentication credentials
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(senderEmail, appPassword);
            }
        });

        try {
            // 4. Create and compose the email message
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(senderEmail));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail));
            message.setSubject("Test Email from Java Application");
            
            // For simple text body:
            message.setText("Hello! This is a test email sent using a Java Mail program.");
            
            // Optional: Uncomment below line to send HTML content instead of plain text
            // message.setContent("<h1>Hello!</h1><p>This is HTML format.</p>", "text/html");

            // 5. Send the email
            System.out.println("Sending email...");
            Transport.send(message);
            System.out.println("Email sent successfully!");

        } catch (MessagingException e) {
            e.printStackTrace();
            System.err.println("Failed to send email: " + e.getMessage());
        }
    }
}
