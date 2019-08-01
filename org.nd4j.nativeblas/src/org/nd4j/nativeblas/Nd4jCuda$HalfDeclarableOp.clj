(ns org.nd4j.nativeblas.Nd4jCuda$HalfDeclarableOp
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCuda$HalfDeclarableOp]))

(defn ->half-declarable-op
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCuda$HalfDeclarableOp [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCuda$HalfDeclarableOp p)))

(defn validate-orders-match
  "block - `org.nd4j.nativeblas.Nd4jCuda$HalfContext`

  returns: `(value="Nd4jStatus")  int`"
  ([^Nd4jCuda$HalfDeclarableOp this ^org.nd4j.nativeblas.Nd4jCuda$HalfContext block]
    (-> this (.validateOrdersMatch block))))

(defn calculate-output-shape
  "This method should be available in each implemented Op, and should return Op output shape(s), for a given input shape(s)

  input-shape - `org.nd4j.nativeblas.Nd4jCuda$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCuda$HalfContext`

  returns: `org.nd4j.nativeblas.Nd4jCuda$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCuda$ShapeList [^Nd4jCuda$HalfDeclarableOp this ^org.nd4j.nativeblas.Nd4jCuda$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCuda$HalfContext block]
    (-> this (.calculateOutputShape input-shape block))))

(defn validate-arguments
  "block - `org.nd4j.nativeblas.Nd4jCuda$HalfContext`

  returns: `(value="Nd4jStatus")  int`"
  ([^Nd4jCuda$HalfDeclarableOp this ^org.nd4j.nativeblas.Nd4jCuda$HalfContext block]
    (-> this (.validateArguments block))))

(defn validate-non-empty-input
  "block - `org.nd4j.nativeblas.Nd4jCuda$HalfContext`

  returns: `(value="Nd4jStatus")  int`"
  ([^Nd4jCuda$HalfDeclarableOp this ^org.nd4j.nativeblas.Nd4jCuda$HalfContext block]
    (-> this (.validateNonEmptyInput block))))

(defn validate-input-dimensions
  "block - `org.nd4j.nativeblas.Nd4jCuda$HalfContext`
  rank - `int`

  returns: `(value="Nd4jStatus")  int`"
  ([^Nd4jCuda$HalfDeclarableOp this ^org.nd4j.nativeblas.Nd4jCuda$HalfContext block ^Integer rank]
    (-> this (.validateInputDimensions block rank))))

(defn get-op-descriptor
  "returns: `org.nd4j.nativeblas.Nd4jCuda$OpDescriptor`"
  (^org.nd4j.nativeblas.Nd4jCuda$OpDescriptor [^Nd4jCuda$HalfDeclarableOp this]
    (-> this (.getOpDescriptor))))

(defn validate-input-3-d
  "block - `org.nd4j.nativeblas.Nd4jCuda$HalfContext`

  returns: `(value="Nd4jStatus")  int`"
  ([^Nd4jCuda$HalfDeclarableOp this ^org.nd4j.nativeblas.Nd4jCuda$HalfContext block]
    (-> this (.validateInput3D block))))

(defn validate-input-4-d
  "block - `org.nd4j.nativeblas.Nd4jCuda$HalfContext`

  returns: `(value="Nd4jStatus")  int`"
  ([^Nd4jCuda$HalfDeclarableOp this ^org.nd4j.nativeblas.Nd4jCuda$HalfContext block]
    (-> this (.validateInput4D block))))

(defn get-op-hash
  "Returns opHash

  returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCuda$HalfDeclarableOp this]
    (-> this (.getOpHash))))

(defn validate-input-length-match
  "block - `org.nd4j.nativeblas.Nd4jCuda$HalfContext`

  returns: `(value="Nd4jStatus")  int`"
  ([^Nd4jCuda$HalfDeclarableOp this ^org.nd4j.nativeblas.Nd4jCuda$HalfContext block]
    (-> this (.validateInputLengthMatch block))))

(defn execute
  "This method executes given Op

  block - `org.nd4j.nativeblas.Nd4jCuda$HalfContext`

  returns: 0 if OK, error code otherwise - `(value="Nd4jStatus")  int`"
  ([^Nd4jCuda$HalfDeclarableOp this ^org.nd4j.nativeblas.Nd4jCuda$HalfContext block]
    (-> this (.execute block))))

(defn validate-input-dimensions-match
  "block - `org.nd4j.nativeblas.Nd4jCuda$HalfContext`

  returns: `(value="Nd4jStatus")  int`"
  ([^Nd4jCuda$HalfDeclarableOp this ^org.nd4j.nativeblas.Nd4jCuda$HalfContext block]
    (-> this (.validateInputDimensionsMatch block))))

(defn validate-input-2-d
  "block - `org.nd4j.nativeblas.Nd4jCuda$HalfContext`

  returns: `(value="Nd4jStatus")  int`"
  ([^Nd4jCuda$HalfDeclarableOp this ^org.nd4j.nativeblas.Nd4jCuda$HalfContext block]
    (-> this (.validateInput2D block))))

(defn get-op-name
  "Returns opName

  returns: `(value={"char*","std::string*"})  org.bytedeco.javacpp.BytePointer`"
  ([^Nd4jCuda$HalfDeclarableOp this]
    (-> this (.getOpName))))

