(ns org.datavec.local.transforms.reduce.ReducerFunction
  "Function for executing
 a reduction of a set of examples by key"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.local.transforms.reduce ReducerFunction]))

(defn ->reducer-function
  "Constructor."
  (^ReducerFunction []
    (new ReducerFunction )))

(defn apply
  "Description copied from interface: Function

  lists - Input - `java.lang.Iterable`

  returns: Result - `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^ReducerFunction this ^java.lang.Iterable lists]
    (-> this (.apply lists))))

