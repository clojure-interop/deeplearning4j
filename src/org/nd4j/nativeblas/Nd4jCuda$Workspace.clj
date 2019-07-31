(ns org.nd4j.nativeblas.Nd4jCuda$Workspace
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCuda$Workspace]))

(defn ->workspace
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCuda$Workspace [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCuda$Workspace p))
  (^Nd4jCuda$Workspace []
    (new Nd4jCuda$Workspace )))

(defn get-current-size
  "returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCuda$Workspace this]
    (-> this (.getCurrentSize))))

(defn get-used-size
  "returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCuda$Workspace this]
    (-> this (.getUsedSize))))

(defn scope-out
  ""
  ([^Nd4jCuda$Workspace this]
    (-> this (.scopeOut))))

(defn expand-by
  "num-bytes - `long`"
  ([^Nd4jCuda$Workspace this ^Long num-bytes]
    (-> this (.expandBy num-bytes))))

(defn get-spilled-size
  "returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCuda$Workspace this]
    (-> this (.getSpilledSize))))

(defn get-current-offset
  "returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCuda$Workspace this]
    (-> this (.getCurrentOffset))))

(defn get-allocated-size
  "returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCuda$Workspace this]
    (-> this (.getAllocatedSize))))

(defn scope-in
  ""
  ([^Nd4jCuda$Workspace this]
    (-> this (.scopeIn))))

(defn clone
  "returns: `org.nd4j.nativeblas.Nd4jCuda$Workspace`"
  (^org.nd4j.nativeblas.Nd4jCuda$Workspace [^Nd4jCuda$Workspace this]
    (-> this (.clone))))

(defn expand-to
  "num-bytes - `long`"
  ([^Nd4jCuda$Workspace this ^Long num-bytes]
    (-> this (.expandTo num-bytes))))

(defn allocate-bytes
  "num-bytes - `long`

  returns: `org.bytedeco.javacpp.Pointer`"
  (^org.bytedeco.javacpp.Pointer [^Nd4jCuda$Workspace this ^Long num-bytes]
    (-> this (.allocateBytes num-bytes))))

