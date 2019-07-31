(ns org.nd4j.Nd4jSerializer
  "Created by agibsonccc on 5/22/16."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j Nd4jSerializer]))

(defn ->nd-4j-serializer
  "Constructor."
  (^Nd4jSerializer []
    (new Nd4jSerializer )))

(defn write
  "Writes the bytes for the object to the output.

  This method should not be called directly, instead this serializer can be passed to Kryo write methods that accept a
  serialier.

  kryo - `com.esotericsoftware.kryo.Kryo`
  output - `com.esotericsoftware.kryo.io.Output`
  object - May be null if Serializer.getAcceptsNull() is true. - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^Nd4jSerializer this ^com.esotericsoftware.kryo.Kryo kryo ^com.esotericsoftware.kryo.io.Output output ^org.nd4j.linalg.api.ndarray.INDArray object]
    (-> this (.write kryo output object))))

(defn read
  "Reads bytes and returns a new object of the specified concrete opType.

  Before Kryo can be used to read child objects, Kryo.reference(Object) must be called with the parent object to
  ensure it can be referenced by the child objects. Any serializer that uses Kryo to read a child object may need to
  be reentrant.

  This method should not be called directly, instead this serializer can be passed to Kryo read methods that accept a
  serialier.

  kryo - `com.esotericsoftware.kryo.Kryo`
  input - `com.esotericsoftware.kryo.io.Input`
  type - `java.lang.Class`

  returns: May be null if Serializer.getAcceptsNull() is true. - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Nd4jSerializer this ^com.esotericsoftware.kryo.Kryo kryo ^com.esotericsoftware.kryo.io.Input input ^java.lang.Class type]
    (-> this (.read kryo input type))))

