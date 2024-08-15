# Walmart Advanced Software Engineering Virtual Experience

This repository includes tasks focused on data structures, processors, database design, and data handling. Here’s a summary of what each task involves:

## Task 1: Power of Two Max Heap

### Objective
Build a unique max heap data structure, known as the "Power of Two Max Heap."

### Requirements
- **Heap Property**: Follow the standard heap rules.
- **Children Rule**: Each parent node should have \(2^x\) children. Use a clear name for \(x\) in your code.
- **Methods**:
  - **Insert**: Add elements to the heap.
  - **Pop Max**: Remove and return the largest element from the heap.
- **Language**: Implement the heap in Java.
- **Performance**: Ensure the heap performs efficiently.

### Note
- Choose a descriptive name for the exponent variable (e.g., `numChildrenExponent`).

## Task 2: UML Class Diagram for Data Processors

### Objective
Create a UML class diagram for a data processing unit in a pipeline.

### Requirements
- **Configuration**: Design a `configure` method to set the processor’s mode and database.
- **Modes**:
  - **Dump Mode**: Discards the data.
  - **Passthrough Mode**: Saves the data to the configured database.
  - **Validate Mode**: Checks and saves the data to the database.
- **Databases**: Support these types:
  - Postgres
  - Redis
  - Elastic
- **Processing**: Implement a `process` method to handle data points based on the mode and database.

### Existing Classes
- **Datapoint**: Represents data.
- **ModeIdentifier**: Enum for processor modes.
- **DatabaseIdentifier**: Enum for database connections.

## Task 3: Entity-Relationship Diagram (ERD)

### Objective
Design an ERD for a database that manages products, customers, transactions, and shipments.

### Requirements
- **Products**:
  - **Pet Food**: Name, Manufacturer, Weight, Flavor, Target Health Condition.
  - **Pet Toys**: Material, Name, Manufacturer, Durability.
  - **Pet Apparel**: Color, Manufacturer, Size, Name, Care Instructions.
- **Associations**:
  - Link products to one or more animals.
  - Link products to manufacturers.
- **Customers and Transactions**:
  - Store customer names and email addresses.
  - Track transactions with dates and products.
- **Shipments**:
  - Record shipments with origin, destination, and product quantities.

## Task 4: Data Ingestion Script

### Objective
Write a Python script to import data from spreadsheets into an SQLite database.

### Requirements
- **Spreadsheet Handling**:
  - **Spreadsheet 0**: Directly insert into the database.
  - **Spreadsheet 1**: Combine rows by shipping ID, calculate quantities, and add rows for each product.
  - **Spreadsheet 2**: Contains shipment origin and destination information.
- **Data Processing**:
  - Read, format, and insert data into the SQLite database.

## Getting Started

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/your-repo-url.git
   cd your-repo-folder
   ```

2. **Dependencies**:
   - **Java**: Make sure JDK is installed.
   - **Python**: Install necessary libraries using `pip install -r requirements.txt`.

3. **Running the Code**:
   - Follow instructions in each task’s directory.

4. **Contributing**:
   - Fork the repository, make your changes, and submit a pull request with a description of your updates.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Contact

For questions or support, please email [your-email@example.com](mailto:your-email@example.com).

---

Feel free to replace placeholders with your actual details and adjust the content as needed.
