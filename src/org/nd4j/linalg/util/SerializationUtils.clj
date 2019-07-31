(ns org.nd4j.linalg.util.SerializationUtils
  "Serialization utils for saving and reading serializable objects"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.util SerializationUtils]))

(defn *read-object
  "Reads an object from the given input stream

  is - the input stream to read from - `java.io.InputStream`

  returns: the read object - `<T> T`"
  ([^java.io.InputStream is]
    (SerializationUtils/readObject is)))

(defn *to-byte-array
  "Converts the given object to a byte array

  to-save - the object to save - `java.io.Serializable`

  returns: `byte[]`"
  ([^java.io.Serializable to-save]
    (SerializationUtils/toByteArray to-save)))

(defn *write-object
  "Writes the object to the output stream
  THIS DOES NOT FLUSH THE STREAM

  to-save - the object to save - `java.io.Serializable`
  write-to - the output stream to write to - `java.io.OutputStream`"
  ([^java.io.Serializable to-save ^java.io.OutputStream write-to]
    (SerializationUtils/writeObject to-save write-to)))

(defn *save-object
  "to-save - `java.lang.Object`
  save-to - `java.io.File`"
  ([^java.lang.Object to-save ^java.io.File save-to]
    (SerializationUtils/saveObject to-save save-to)))

