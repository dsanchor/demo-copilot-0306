# MyRestController API Endpoints

This document provides a summary of the REST operations available in the `MyRestController` class.

## 1. Reverse Text

This operation reverses the input text.

- **URL**: `/api/reverse`
- **Method**: `GET`
- **URL Params**: `text=[string]`
- **Success Response**: Reversed string

**Curl Example:**

```bash
curl -X GET 'http://localhost:8080/api/reverse?text=example'
```

## 2. Disemvowel Text

This operation removes all vowels from the input text.

- **URL**: `/api/disemvowel`
- **Method**: `GET`
- **URL Params**: `text=[string]`
- **Success Response**: String with all vowels removed

**Curl Example:**

```bash
curl -X GET 'http://localhost:8080/api/disemvowel?text=example'
```

## 3. Check Palindrome

This operation checks if the input text is a palindrome.

- **URL**: `/api/palindrome`
- **Method**: `GET`
- **URL Params**: `text=[string]`
- **Success Response**: "Yes" if the text is a palindrome, "No" otherwise

**Curl Example:**

```bash
curl -X GET 'http://localhost:8080/api/palindrome?text=example'
```
