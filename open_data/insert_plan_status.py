import insert_from_file

def insert():
    table = 'plan_status'
    columns = ['code', 'name']

    insert_from_file.insert(table, table, columns, columns)
