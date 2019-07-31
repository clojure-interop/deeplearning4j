(ns org.nd4j.nativeblas.Nd4jCpu$float_pick_list
  "This operations selects specified indices fron NDArrayList and returns them as NDArray
 Expected arguments:
 x: non-empty list
 indices: optional, vector with indices
 Int args:
 optional, indices"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_pick_list]))

(defn ->float-pick-list
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_pick_list [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_pick_list p))
  (^Nd4jCpu$float_pick_list []
    (new Nd4jCpu$float_pick_list )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_pick_list`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_pick_list [^Nd4jCpu$float_pick_list this ^Long position]
    (-> this (.position position))))

