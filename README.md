# Caesar Cipher in Java

A simple Java implementation of the Caesar Cipher encryption technique. This program allows users to encrypt and decrypt messages by shifting letters of the alphabet by a specified number of positions.

## Features

* Encrypt text using a custom shift value
* Decrypt encrypted text
* Preserves spaces, numbers, and special characters
* Supports both uppercase and lowercase letters
* Simple command-line interface

## How It Works

The Caesar Cipher is one of the oldest encryption techniques. Each letter in a message is shifted by a fixed number of positions in the alphabet.

Example with a shift of 3:

```text
A → D
B → E
C → F
...
X → A
Y → B
Z → C
```

Message:

```text
HELLO
```

Encrypted:

```text
KHOOR
```

## Requirements

* Java JDK 8 or higher

## Installation

1. Clone this repository:

```bash
git clone https://github.com/your-username/caesar-cipher-java.git
```

2. Navigate to the project directory:

```bash
cd caesar-cipher-java
```

3. Compile the program:

```bash
javac CaesarCipher.java
```

4. Run the program:

```bash
java CaesarCipher
```

## Usage

When you run the program, you will see:

```text
=== Caesar Cipher ===
1. Encrypt
2. Decrypt
Choose an option:
```

### Encryption Example

Input:

```text
Choose an option: 1
Enter your message: Hello World
Enter shift value: 3
```

Output:

```text
Encrypted Message: Khoor Zruog
```

### Decryption Example

Input:

```text
Choose an option: 2
Enter your message: Khoor Zruog
Enter shift value: 3
```

Output:

```text
Decrypted Message: Hello World
```

## Project Structure

```text
CaesarCipher.java
README.md
```

## Concepts Used

* Java Methods
* Loops
* Conditional Statements
* StringBuilder
* Character Manipulation
* Modular Arithmetic
* User Input with Scanner

## Future Improvements

* Brute-force decryption mode
* Graphical User Interface (GUI)
* File encryption and decryption
* Support for custom alphabets
* Save encrypted messages to files

## Author

Bhargav Patel

## License

Free to use for learning

This project is open-source and available under the MIT License.
