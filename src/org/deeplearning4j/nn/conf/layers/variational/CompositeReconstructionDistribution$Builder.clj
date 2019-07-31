(ns org.deeplearning4j.nn.conf.layers.variational.CompositeReconstructionDistribution$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers.variational CompositeReconstructionDistribution$Builder]))

(defn ->builder
  "Constructor."
  (^CompositeReconstructionDistribution$Builder []
    (new CompositeReconstructionDistribution$Builder )))

(defn add-distribution
  "Add another distribution to the composite distribution. This will add the distribution for the next 'distributionSize'
  values, after any previously added.
  For example, calling addDistribution(10, X) once will result in values 0 to 9 (inclusive) being modelled
  by the specified distribution X. Calling addDistribution(10, Y) after that will result in values 10 to 19 (inclusive)
  being modelled by distribution Y.

  distribution-size - Number of values to model with the specified distribution - `int`
  distribution - Distribution to model data with - `org.deeplearning4j.nn.conf.layers.variational.ReconstructionDistribution`

  returns: `org.deeplearning4j.nn.conf.layers.variational.CompositeReconstructionDistribution$Builder`"
  (^org.deeplearning4j.nn.conf.layers.variational.CompositeReconstructionDistribution$Builder [^CompositeReconstructionDistribution$Builder this ^Integer distribution-size ^org.deeplearning4j.nn.conf.layers.variational.ReconstructionDistribution distribution]
    (-> this (.addDistribution distribution-size distribution))))

(defn build
  "returns: `org.deeplearning4j.nn.conf.layers.variational.CompositeReconstructionDistribution`"
  (^org.deeplearning4j.nn.conf.layers.variational.CompositeReconstructionDistribution [^CompositeReconstructionDistribution$Builder this]
    (-> this (.build))))

