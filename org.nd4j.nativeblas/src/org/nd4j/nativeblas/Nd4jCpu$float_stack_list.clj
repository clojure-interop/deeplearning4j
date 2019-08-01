(ns org.nd4j.nativeblas.Nd4jCpu$float_stack_list
  "This operation concatenates given NDArrayList, and returns NDArray as result"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_stack_list]))

(defn ->float-stack-list
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_stack_list [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_stack_list p))
  (^Nd4jCpu$float_stack_list []
    (new Nd4jCpu$float_stack_list )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_stack_list`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_stack_list [^Nd4jCpu$float_stack_list this ^Long position]
    (-> this (.position position))))

