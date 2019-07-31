(ns org.nd4j.nativeblas.Nd4jCpu$ShapeInformation
  "Shape information approximating
 the information on an ndarray"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$ShapeInformation]))

(defn ->shape-information
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$ShapeInformation [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$ShapeInformation p))
  (^Nd4jCpu$ShapeInformation [^org.bytedeco.javacpp.LongPointer stride ^Character order ^Integer rank ^Integer offset ^Integer element-wise-stride]
    (new Nd4jCpu$ShapeInformation stride order rank offset element-wise-stride))
  (^Nd4jCpu$ShapeInformation []
    (new Nd4jCpu$ShapeInformation )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeInformation`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeInformation [^Nd4jCpu$ShapeInformation this ^Long position]
    (-> this (.position position))))

(defn shape
  "shape - `org.bytedeco.javacpp.LongPointer`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeInformation`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeInformation [^Nd4jCpu$ShapeInformation this ^org.bytedeco.javacpp.LongPointer shape]
    (-> this (.shape shape)))
  ([^Nd4jCpu$ShapeInformation this]
    (-> this (.shape))))

(defn stride
  "stride - `org.bytedeco.javacpp.LongPointer`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeInformation`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeInformation [^Nd4jCpu$ShapeInformation this ^org.bytedeco.javacpp.LongPointer stride]
    (-> this (.stride stride)))
  ([^Nd4jCpu$ShapeInformation this]
    (-> this (.stride))))

(defn order
  "order - `char`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeInformation`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeInformation [^Nd4jCpu$ShapeInformation this ^Character order]
    (-> this (.order order)))
  (^Character [^Nd4jCpu$ShapeInformation this]
    (-> this (.order))))

(defn rank
  "rank - `int`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeInformation`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeInformation [^Nd4jCpu$ShapeInformation this ^Integer rank]
    (-> this (.rank rank)))
  (^Integer [^Nd4jCpu$ShapeInformation this]
    (-> this (.rank))))

(defn offset
  "offset - `int`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeInformation`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeInformation [^Nd4jCpu$ShapeInformation this ^Integer offset]
    (-> this (.offset offset)))
  (^Integer [^Nd4jCpu$ShapeInformation this]
    (-> this (.offset))))

(defn element-wise-stride
  "element-wise-stride - `int`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeInformation`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeInformation [^Nd4jCpu$ShapeInformation this ^Integer element-wise-stride]
    (-> this (.elementWiseStride element-wise-stride)))
  (^Integer [^Nd4jCpu$ShapeInformation this]
    (-> this (.elementWiseStride))))

