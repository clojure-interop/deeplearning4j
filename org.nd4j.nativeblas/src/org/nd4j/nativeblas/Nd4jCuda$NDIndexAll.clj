(ns org.nd4j.nativeblas.Nd4jCuda$NDIndexAll
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCuda$NDIndexAll]))

(defn ->nd-index-all
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCuda$NDIndexAll [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCuda$NDIndexAll p))
  (^Nd4jCuda$NDIndexAll []
    (new Nd4jCuda$NDIndexAll )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCuda$NDIndexAll`"
  (^org.nd4j.nativeblas.Nd4jCuda$NDIndexAll [^Nd4jCuda$NDIndexAll this ^Long position]
    (-> this (.position position))))

