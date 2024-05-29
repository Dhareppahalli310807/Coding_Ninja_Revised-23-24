// Please don't change the pre-written code
// Import the necessary modules here
import nodemailer from 'nodemailer';
import readline from 'readline';

const Solution = () => {
  // Write your code here
  const transporter = nodemailer.createTransport({
    service: 'gmail',
    auth: {
      user: 'codingninjas2k16@gmail.com',
      pass: 'slwvvlczduktvhdj'
    }
  });
  // Create readline interface
  const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
  });

  //2. configure email content
  const emailOptions= {
    from:'codingninjas2k16@gmail.com',
    to:'dharepps@gmail.com',
    subject:'Coding Ninjas',
    text:'The world has enough coders; be a coding ninja!',
};
  rl.question('Enter recipient\'s email address: ', (email) => {
    // Send email
    transporter.sendMail({
      from: 'codingninjas2k16@gmail.com',
      to: email,
      subject: 'Coding Ninjas',
      text: 'The world has enough coders; be a coding ninja!'
    }, (error, info) => {
      if (error) {
        console.log('Error occurred:', error);
      } else {
        console.log('Email sent successfully:', info.response);
      }
      // Close readline interface
      rl.close();
    });
  });
};

export default Solution;
