(ns org.nd4j.nativeblas.Nd4jCuda$OpRegistrator
  "This class provides runtime ops lookup, based on opName or opHash.
 To build lookup directory we use *_OP_IMPL macro, which puts static structs at compile time in .cpp files,
 so once binary is executed, static objects are initialized automatically, and we get list of all ops
 available at runtime via this singleton."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCuda$OpRegistrator]))

(defn ->op-registrator
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCuda$OpRegistrator [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCuda$OpRegistrator p)))

(defn *get-instance
  "returns: `org.nd4j.nativeblas.Nd4jCuda$OpRegistrator`"
  (^org.nd4j.nativeblas.Nd4jCuda$OpRegistrator []
    (Nd4jCuda$OpRegistrator/getInstance )))

(defn *exit-handler
  ""
  ([]
    (Nd4jCuda$OpRegistrator/exitHandler )))

(defn *sig-int-handler
  "sig - `int`"
  ([^Integer sig]
    (Nd4jCuda$OpRegistrator/sigIntHandler sig)))

(defn *sig-seg-v-handler
  "sig - `int`"
  ([^Integer sig]
    (Nd4jCuda$OpRegistrator/sigSegVHandler sig)))

(defn get-all-custom-operations
  "returns: `(value="char*")  java.lang.String`"
  ([^Nd4jCuda$OpRegistrator this]
    (-> this (.getAllCustomOperations))))

(defn register-operation-float
  "This method registers operation

  op - `org.nd4j.nativeblas.Nd4jCuda$FloatDeclarableOp`

  returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$OpRegistrator this ^org.nd4j.nativeblas.Nd4jCuda$FloatDeclarableOp op]
    (-> this (.registerOperationFloat op)))
  ([^Nd4jCuda$OpRegistrator this ^java.lang.String name ^org.nd4j.nativeblas.Nd4jCuda$FloatDeclarableOp op]
    (-> this (.registerOperationFloat name op))))

(defn register-operation-double
  "name - `java.lang.String`
  op - `org.nd4j.nativeblas.Nd4jCuda$DoubleDeclarableOp`

  returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$OpRegistrator this ^java.lang.String name ^org.nd4j.nativeblas.Nd4jCuda$DoubleDeclarableOp op]
    (-> this (.registerOperationDouble name op)))
  ([^Nd4jCuda$OpRegistrator this ^org.nd4j.nativeblas.Nd4jCuda$DoubleDeclarableOp op]
    (-> this (.registerOperationDouble op))))

(defn register-operation-half
  "name - `java.lang.String`
  op - `org.nd4j.nativeblas.Nd4jCuda$HalfDeclarableOp`

  returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$OpRegistrator this ^java.lang.String name ^org.nd4j.nativeblas.Nd4jCuda$HalfDeclarableOp op]
    (-> this (.registerOperationHalf name op)))
  ([^Nd4jCuda$OpRegistrator this ^org.nd4j.nativeblas.Nd4jCuda$HalfDeclarableOp op]
    (-> this (.registerOperationHalf op))))

(defn get-operation-float
  "This method returns registered Op by name

  hash - `long`

  returns: `org.nd4j.nativeblas.Nd4jCuda$FloatDeclarableOp`"
  (^org.nd4j.nativeblas.Nd4jCuda$FloatDeclarableOp [^Nd4jCuda$OpRegistrator this ^Long hash]
    (-> this (.getOperationFloat hash))))

(defn get-operation-half
  "hash - `long`

  returns: `org.nd4j.nativeblas.Nd4jCuda$HalfDeclarableOp`"
  (^org.nd4j.nativeblas.Nd4jCuda$HalfDeclarableOp [^Nd4jCuda$OpRegistrator this ^Long hash]
    (-> this (.getOperationHalf hash))))

(defn get-operation-double
  "name - `java.lang.String`

  returns: `org.nd4j.nativeblas.Nd4jCuda$DoubleDeclarableOp`"
  (^org.nd4j.nativeblas.Nd4jCuda$DoubleDeclarableOp [^Nd4jCuda$OpRegistrator this ^java.lang.String name]
    (-> this (.getOperationDouble name))))

(defn number-of-operations
  "returns: `int`"
  (^Integer [^Nd4jCuda$OpRegistrator this]
    (-> this (.numberOfOperations))))

