# sabah-library-app
A backend application for book library of Sabah
Please go to http://localhost:8080/swagger-ui/index.htm view the api doc (username: johndoe@gmail.com, password: admin)

Database Justification 

1. Embedded Mode
    H2 can be embedded within Java applications, which means it runs within the same JVM as your application. This is beneficial for:

    Simplified deployment: No need for a separate database server installation or configuration.
    Reduced latency: Direct access to the database from the application, leading to faster data operations.
    Ease of use: Simplifies the setup, especially for small-scale or educational projects.
2. In-Memory Database
    H2 supports in-memory databases, which are ideal for:

    Testing and development: Fast, transient storage without the need for persistence, perfect for unit tests and rapid prototyping.
    Performance: Extremely fast read and write operations as data is stored in RAM.
3. Compatibility
    H2 is compatible with standard SQL and offers compatibility modes for other databases like MySQL, PostgreSQL, and Oracle. This means:

    Ease of transition: You can develop using H2 and later switch to a more robust database if needed with minimal changes to your SQL queries.
    Learning experience: Students or developers can learn SQL and database management concepts that are applicable to other major databases.
4. Lightweight and Fast
    H2 is lightweight and has a small footprint, which is suitable for:

    Limited resources: Ideal for projects running on environments with limited resources (like student laptops).
    Speed: Fast startup and shutdown times make it ideal for iterative development processes.
5. Easy to Use
    H2 has a simple setup and a user-friendly web-based console for managing the database, making it suitable for:

    Beginners: Those new to databases can quickly get started without being overwhelmed by complex configurations.
    Quick iterations: Easy to create, drop, and modify databases and tables, facilitating rapid development cycles.
6. Open Source
    H2 is open-source, which provides:

    Cost-effectiveness: No licensing fees, making it accessible for students and educational institutions.
    Community support: Access to community-driven help and resources.
7. Documentation and Support
    H2 has extensive documentation and a supportive community, which helps in:

    Learning: Comprehensive guides and examples are available to help understand and utilize the database effectively.
    Troubleshooting: Easier to find solutions to potential issues through community forums and documentation.
Conclusion
Using H2 for this assignment project provides a combination of simplicity, speed, and ease of use that makes it ideal for educational purposes and rapid development. Its features align well with the typical requirements of assignment projects, such as ease of setup, flexibility, and minimal resource consumption. Additionally, its compatibility with standard SQL ensures that the skills and knowledge gained are transferable to other database systems.