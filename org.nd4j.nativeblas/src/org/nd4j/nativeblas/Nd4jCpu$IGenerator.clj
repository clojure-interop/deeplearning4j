(ns org.nd4j.nativeblas.Nd4jCpu$IGenerator
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$IGenerator]))

(defn ->i-generator
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$IGenerator [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$IGenerator p)))

(defn get-buffer
  "returns: `org.nd4j.nativeblas.Nd4jCpu$RandomBuffer`"
  (^org.nd4j.nativeblas.Nd4jCpu$RandomBuffer [^Nd4jCpu$IGenerator this]
    (-> this (.getBuffer))))

(defn set-offset
  "offset - `long`"
  ([^Nd4jCpu$IGenerator this ^Long offset]
    (-> this (.setOffset offset))))

(defn get-element-absolute
  "position - `long`

  returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCpu$IGenerator this ^Long position]
    (-> this (.getElementAbsolute position))))

(defn get-element-relative
  "position - `long`

  returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCpu$IGenerator this ^Long position]
    (-> this (.getElementRelative position))))

(defn refresh-buffer
  ""
  ([^Nd4jCpu$IGenerator this]
    (-> this (.refreshBuffer))))

