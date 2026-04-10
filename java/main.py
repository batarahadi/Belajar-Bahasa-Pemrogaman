while 1:
    try:
        user_input = input("Enter something (or 'exit' to quit): ")
        if user_input.lower() == 'exit':
            print("Goodbye!")
            break
        else:
            print(f"You entered: {user_input}")
    except Exception as e:
        print(f"An error occurred: {e}")