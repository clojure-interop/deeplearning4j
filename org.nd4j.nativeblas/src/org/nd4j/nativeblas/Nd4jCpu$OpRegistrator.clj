(ns org.nd4j.nativeblas.Nd4jCpu$OpRegistrator
  "This class provides runtime ops lookup, based on opName or opHash.
 To build lookup directory we use *_OP_IMPL macro, which puts static structs at compile time in .cpp files,
 so once binary is executed, static objects are initialized automatically, and we get list of all ops
 available at runtime via this singleton."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$OpRegistrator]))

(defn ->op-registrator
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$OpRegistrator [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$OpRegistrator p)))

(defn *get-instance
  "returns: `org.nd4j.nativeblas.Nd4jCpu$OpRegistrator`"
  (^org.nd4j.nativeblas.Nd4jCpu$OpRegistrator []
    (Nd4jCpu$OpRegistrator/getInstance )))

(defn *exit-handler
  ""
  ([]
    (Nd4jCpu$OpRegistrator/exitHandler )))

(defn *sig-int-handler
  "sig - `int`"
  ([^Integer sig]
    (Nd4jCpu$OpRegistrator/sigIntHandler sig)))

(defn *sig-seg-v-handler
  "sig - `int`"
  ([^Integer sig]
    (Nd4jCpu$OpRegistrator/sigSegVHandler sig)))

(defn get-all-custom-operations
  "returns: `(value="char*")  java.lang.String`"
  ([^Nd4jCpu$OpRegistrator this]
    (-> this (.getAllCustomOperations))))

(defn register-operation-float
  "This method registers operation

  op - `org.nd4j.nativeblas.Nd4jCpu$FloatDeclarableOp`

  returns: `(value="bool")  boolean`"
  ([^Nd4jCpu$OpRegistrator this ^org.nd4j.nativeblas.Nd4jCpu$FloatDeclarableOp op]
    (-> this (.registerOperationFloat op)))
  ([^Nd4jCpu$OpRegistrator this ^java.lang.String name ^org.nd4j.nativeblas.Nd4jCpu$FloatDeclarableOp op]
    (-> this (.registerOperationFloat name op))))

(defn register-operation-double
  "name - `java.lang.String`
  op - `org.nd4j.nativeblas.Nd4jCpu$DoubleDeclarableOp`

  returns: `(value="bool")  boolean`"
  ([^Nd4jCpu$OpRegistrator this ^java.lang.String name ^org.nd4j.nativeblas.Nd4jCpu$DoubleDeclarableOp op]
    (-> this (.registerOperationDouble name op)))
  ([^Nd4jCpu$OpRegistrator this ^org.nd4j.nativeblas.Nd4jCpu$DoubleDeclarableOp op]
    (-> this (.registerOperationDouble op))))

(defn register-operation-half
  "name - `java.lang.String`
  op - `org.nd4j.nativeblas.Nd4jCpu$HalfDeclarableOp`

  returns: `(value="bool")  boolean`"
  ([^Nd4jCpu$OpRegistrator this ^java.lang.String name ^org.nd4j.nativeblas.Nd4jCpu$HalfDeclarableOp op]
    (-> this (.registerOperationHalf name op)))
  ([^Nd4jCpu$OpRegistrator this ^org.nd4j.nativeblas.Nd4jCpu$HalfDeclarableOp op]
    (-> this (.registerOperationHalf op))))

(defn get-operation-float
  "This method returns registered Op by name

  hash - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$FloatDeclarableOp`"
  (^org.nd4j.nativeblas.Nd4jCpu$FloatDeclarableOp [^Nd4jCpu$OpRegistrator this ^Long hash]
    (-> this (.getOperationFloat hash))))

(defn get-operation-half
  "hash - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$HalfDeclarableOp`"
  (^org.nd4j.nativeblas.Nd4jCpu$HalfDeclarableOp [^Nd4jCpu$OpRegistrator this ^Long hash]
    (-> this (.getOperationHalf hash))))

(defn get-operation-double
  "name - `java.lang.String`

  returns: `org.nd4j.nativeblas.Nd4jCpu$DoubleDeclarableOp`"
  (^org.nd4j.nativeblas.Nd4jCpu$DoubleDeclarableOp [^Nd4jCpu$OpRegistrator this ^java.lang.String name]
    (-> this (.getOperationDouble name))))

(defn number-of-operations
  "returns: `int`"
  (^Integer [^Nd4jCpu$OpRegistrator this]
    (-> this (.numberOfOperations))))

