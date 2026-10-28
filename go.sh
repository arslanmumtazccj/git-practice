#!/bin/bash
set -e

echo "Compiling Java files..."
javac -d out -sourcepath src $(find src -name "*.java")

echo "Running App..."
java -cp out app.Demo
