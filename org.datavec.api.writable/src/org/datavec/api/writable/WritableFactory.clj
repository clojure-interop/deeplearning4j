(ns org.datavec.api.writable.WritableFactory
  "Factory class for creating and saving writable objects to/from DataInput and DataOutput"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.writable WritableFactory]))

(defn *get-instance
  "returns: Singleton WritableFactory instance - `org.datavec.api.writable.WritableFactory`"
  (^org.datavec.api.writable.WritableFactory []
    (WritableFactory/getInstance )))

(defn register-writable-type
  "Register a writable class with a specific key (as a short). Note that key values must be unique for each type of
  Writable, as they are used as type information in certain types of serialisation. Consequently, an exception will
  be thrown If the key value is not unique or is already assigned.
  Note that in general, this method needs to only be used for custom Writable types; Care should be taken to ensure
  that the given key does not change once assigned.

  writable-type-key - Key for the Writable - `short`
  writable-class - Class for the given key. Must have a no-arg constructor - `java.lang.Class`"
  ([^WritableFactory this ^Short writable-type-key ^java.lang.Class writable-class]
    (-> this (.registerWritableType writable-type-key writable-class))))

(defn new-writable
  "Create a new writable instance (using reflection) given the specified key

  writable-type-key - Key to create a new writable instance for - `short`

  returns: A new (empty/default) Writable instance - `org.datavec.api.writable.Writable`"
  (^org.datavec.api.writable.Writable [^WritableFactory this ^Short writable-type-key]
    (-> this (.newWritable writable-type-key))))

(defn write-with-type
  "A convenience method for writing a given Writable object to a DataOutput. The key is 1st written (a single short)
  followed by the value from writable.

  w - Writable value - `org.datavec.api.writable.Writable`
  data-output - DataOutput to write both key and value to - `java.io.DataOutput`

  throws: java.io.IOException - If an error occurs during writing to the DataOutput"
  ([^WritableFactory this ^org.datavec.api.writable.Writable w ^java.io.DataOutput data-output]
    (-> this (.writeWithType w data-output))))

(defn read-with-type
  "Read a Writable From the DataInput, where the Writable was previously written using writeWithType(Writable, DataOutput)

  data-input - DataInput to read the Writable from - `java.io.DataInput`

  returns: Writable from the DataInput - `org.datavec.api.writable.Writable`

  throws: java.io.IOException - In an error occurs during reading"
  (^org.datavec.api.writable.Writable [^WritableFactory this ^java.io.DataInput data-input]
    (-> this (.readWithType data-input))))

