(ns org.nd4j.linalg.primitives.ImmutableQuad
  "Simple quad elements holder implementation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.primitives ImmutableQuad]))

(defn ->immutable-quad
  "Constructor."
  (^ImmutableQuad []
    (new ImmutableQuad )))

(defn *quad-of
  "first - `F`
  second - `S`
  third - `T`
  fourth - `O`

  returns: `<F,S,T,O> org.nd4j.linalg.primitives.ImmutableQuad<F,S,T,O>`"
  ([first second third fourth]
    (ImmutableQuad/quadOf first second third fourth)))

(defn *of
  "first - `F`
  second - `S`
  third - `T`
  fourth - `O`

  returns: `<F,S,T,O> org.nd4j.linalg.primitives.ImmutableQuad<F,S,T,O>`"
  ([first second third fourth]
    (ImmutableQuad/of first second third fourth)))

