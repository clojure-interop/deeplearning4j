(ns org.nd4j.weightinit.impl.XavierUniformInitScheme
  "Initialize the weight to:
 //As per Glorot and Bengio 2010: Uniform distribution U(-s,s) with s = sqrt(6/(fanIn  fanOut))
 Eq 16: http://jmlr.org/proceedings/papers/v9/glorot10a/glorot10a.pdf"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.weightinit.impl XavierUniformInitScheme]))

(defn ->xavier-uniform-init-scheme
  "Constructor.

  order - `char`
  fan-in - `double`
  fan-out - `double`"
  (^XavierUniformInitScheme [^Character order ^Double fan-in ^Double fan-out]
    (new XavierUniformInitScheme order fan-in fan-out)))

(defn do-create
  "shape - `long[]`
  params-view - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^XavierUniformInitScheme this shape ^org.nd4j.linalg.api.ndarray.INDArray params-view]
    (-> this (.doCreate shape params-view))))

(defn type
  "Description copied from interface: WeightInitScheme

  returns: `org.nd4j.weightinit.WeightInit`"
  (^org.nd4j.weightinit.WeightInit [^XavierUniformInitScheme this]
    (-> this (.type))))

