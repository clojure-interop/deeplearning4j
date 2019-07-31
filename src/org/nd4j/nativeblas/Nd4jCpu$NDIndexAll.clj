(ns org.nd4j.nativeblas.Nd4jCpu$NDIndexAll
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$NDIndexAll]))

(defn ->nd-index-all
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$NDIndexAll [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$NDIndexAll p))
  (^Nd4jCpu$NDIndexAll []
    (new Nd4jCpu$NDIndexAll )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$NDIndexAll`"
  (^org.nd4j.nativeblas.Nd4jCpu$NDIndexAll [^Nd4jCpu$NDIndexAll this ^Long position]
    (-> this (.position position))))

