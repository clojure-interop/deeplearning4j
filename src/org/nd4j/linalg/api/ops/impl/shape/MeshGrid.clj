(ns org.nd4j.linalg.api.ops.impl.shape.MeshGrid
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.shape MeshGrid]))

(defn ->mesh-grid
  "Constructor.

  sd - `org.nd4j.autodiff.samediff.SameDiff`
  cartesian - If true: broadcast dimensions for first two dimensions are swapped - `boolean`
  inputs - `org.nd4j.autodiff.samediff.SDVariable`"
  (^MeshGrid [^org.nd4j.autodiff.samediff.SameDiff sd ^Boolean cartesian ^org.nd4j.autodiff.samediff.SDVariable inputs]
    (new MeshGrid sd cartesian inputs))
  (^MeshGrid []
    (new MeshGrid )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^MeshGrid this]
    (-> this (.opName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  gradients - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^MeshGrid this ^java.util.List gradients]
    (-> this (.doDiff gradients))))

(defn get-num-outputs
  "returns: `int`"
  (^Integer [^MeshGrid this]
    (-> this (.getNumOutputs))))

