(ns org.nd4j.linalg.primitives.Quad
  "Simple triple elements holder implementation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.primitives Quad]))

(defn ->quad
  "Constructor."
  (^Quad []
    (new Quad )))

(defn *quad-of
  "first - `F`
  second - `S`
  third - `T`
  fourth - `O`

  returns: `<F,S,T,O> org.nd4j.linalg.primitives.Quad<F,S,T,O>`"
  ([first second third fourth]
    (Quad/quadOf first second third fourth)))

(defn *of
  "first - `F`
  second - `S`
  third - `T`
  fourth - `O`

  returns: `<F,S,T,O> org.nd4j.linalg.primitives.Quad<F,S,T,O>`"
  ([first second third fourth]
    (Quad/of first second third fourth)))

