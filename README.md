🧩 Project Overview

This project implements a board-based game simulation system in Java, where multiple types of characters (humans, elves, etc.) are rendered in on the board and can perform different moves.

The application focuses on core logic and architecture, emphasizing the use of design patterns to ensure scalability, flexibility, and clean separation of concerns.

🌍 Core Concept

- A configurable board (2D grid) hosts all entities.

- Characters have attributes such as position, size, age, and abilities.

- Characters can be organized into hierarchical structures like groups, legions, or armies.

- The environment includes scene-specific houses (European, Asian, African), each with unique characteristics.

- Movement is validated to prevent overlapping with houses or other entities.

🏗️ Key Features

- Scene generation based on cultural themes

- Collision detection for characters and groups

- Group movement logic (aggregate size handling)

- Central .render() method to display the current state of all entities

🎯 Objective

The goal of this project is to demonstrate how multiple design patterns (such as Factory, Composite, Command, and others) can be applied to build a modular and extensible game simulation engine.
