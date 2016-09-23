package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.storage.exception.StorageOperationException;

/**
 * Represents the file used to store address book data.
 */
public class StorageStub implements Storage {

    /**
     * Saves all data to this storage file.
     *
     * @throws StorageOperationException
     *             if there were errors converting and/or storing data to file.
     */
    public void save(AddressBook addressBook) throws StorageOperationException {

    }

    /**
     * Loads data from this storage file.
     *
     * @throws StorageOperationException
     *             if there were errors reading and/or converting data from
     *             file.
     */
    public AddressBook load() throws StorageOperationException {
        return null;
    }

    public String getPath() {
        return "";
    }

}
