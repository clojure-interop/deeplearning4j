(ns org.nd4j.nativeblas.Nd4jCuda$IGenerator
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCuda$IGenerator]))

(defn ->i-generator
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCuda$IGenerator [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCuda$IGenerator p)))

(defn get-buffer
  "returns: `org.nd4j.nativeblas.Nd4jCuda$RandomBuffer`"
  (^org.nd4j.nativeblas.Nd4jCuda$RandomBuffer [^Nd4jCuda$IGenerator this]
    (-> this (.getBuffer))))

(defn set-offset
  "offset - `long`"
  ([^Nd4jCuda$IGenerator this ^Long offset]
    (-> this (.setOffset offset))))

(defn get-element-absolute
  "position - `long`

  returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCuda$IGenerator this ^Long position]
    (-> this (.getElementAbsolute position))))

(defn get-element-relative
  "position - `long`

  returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCuda$IGenerator this ^Long position]
    (-> this (.getElementRelative position))))

(defn refresh-buffer
  ""
  ([^Nd4jCuda$IGenerator this]
    (-> this (.refreshBuffer))))

