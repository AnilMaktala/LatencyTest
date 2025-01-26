# Latency Test 2: Android App with AWS Amplify Integration

Latency Test 2 is an Android application that leverages AWS Amplify for backend services, including authentication, API, and data storage. The app is designed to measure and analyze latency in various operations.

This project demonstrates the integration of AWS AppSync for GraphQL APIs, Amazon Cognito for user authentication, and DynamoDB for data persistence. It provides a foundation for building scalable and secure mobile applications with real-time data synchronization capabilities.

## Repository Structure

The repository is structured as follows:

- `amplify/`: Contains AWS Amplify configuration and backend definition files
  - `backend/`: Defines the backend resources (API, auth, etc.)
- `app/`: Contains the Android application source code
  - `src/`: Application source files
    - `main/`: Main application code
      - `java/`: Java source files
      - `graphql/`: GraphQL schema and operations
  - `build.gradle`: App-level build configuration
- `build.gradle`: Project-level build configuration
- `gradlew` and `gradlew.bat`: Gradle wrapper scripts

Key files:
- `amplify/backend/api/latencytest2/schema.graphql`: Defines the GraphQL schema for the API
- `app/src/main/java/com/example/latencytest2/MainActivity.java`: Entry point of the Android application
- `app/src/main/java/com/example/latencytest2/LatencyTest2App.java`: Application class for Amplify initialization

## Usage Instructions

### Prerequisites

- Android Studio 4.0+
- JDK 8+
- AWS Account
- Amplify CLI (2.0+)

### Installation

1. Clone the repository:
   ```
   git clone <repository-url>
   ```

2. Open the project in Android Studio.

3. Initialize Amplify in the project directory:
   ```
   amplify init
   ```

4. Push the backend to AWS:
   ```
   amplify push
   ```

5. Build and run the application on an emulator or physical device.

### Configuration

The application uses the following AWS services:

- AppSync: Provides the GraphQL API
- Cognito: Handles user authentication
- DynamoDB: Stores application data

To modify the backend configuration:

1. Update the schema in `amplify/backend/api/latencytest2/schema.graphql`
2. Run `amplify push` to apply changes

### Testing & Quality

To run unit tests:

```
./gradlew test
```

To run instrumented tests:

```
./gradlew connectedAndroidTest
```

### Troubleshooting

1. Amplify initialization fails:
   - Error: "Failed to configure Amplify"
   - Solution: Ensure that `awsconfiguration.json` is present in the `app/src/main/res/raw/` directory. If missing, run `amplify push` to generate it.

2. GraphQL operations fail:
   - Error: "API_KEY authentication is not allowed for this operation"
   - Solution: Check the authentication settings in `amplify/backend/api/latencytest2/cli-inputs.json` and ensure the correct authentication type is used for each operation.

3. Cognito user pool issues:
   - Error: "User pool not found"
   - Solution: Verify the Cognito user pool configuration in `amplify/backend/auth/latencytest25b343474/cli-inputs.json` and ensure it matches the AWS Console settings.

## Data Flow

The application follows this general data flow:

1. User authentication through Cognito
2. GraphQL API calls to AppSync
3. Data persistence in DynamoDB
4. Real-time updates via AppSync subscriptions

```
[User] <-> [Android App] <-> [AppSync API] <-> [DynamoDB]
                ^
                |
         [Cognito Auth]
```

Important technical considerations:
- Ensure proper error handling for network operations
- Implement offline support using DataStore for seamless user experience
- Use appropriate authentication methods (API Key, Cognito, IAM) based on operation sensitivity

## Infrastructure

The project uses the following AWS resources:

AppSync:
- API Name: latencytest2
- Authentication: API Key (default), Cognito User Pools, IAM
- Conflict Resolution: AUTOMERGE

Cognito:
- User Pool: latencytest25b343474_userpool_5b343474
- Identity Pool: latencytest25b343474_identitypool_5b343474
- User Pool Group: Latency2

DynamoDB:
- Billing Mode: PAY_PER_REQUEST
- Server-Side Encryption: Disabled
