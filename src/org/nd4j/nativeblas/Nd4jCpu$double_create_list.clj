(ns org.nd4j.nativeblas.Nd4jCpu$double_create_list
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$double_create_list]))

(defn ->double-create-list
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$double_create_list [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$double_create_list p))
  (^Nd4jCpu$double_create_list []
    (new Nd4jCpu$double_create_list )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$double_create_list`"
  (^org.nd4j.nativeblas.Nd4jCpu$double_create_list [^Nd4jCpu$double_create_list this ^Long position]
    (-> this (.position position))))

