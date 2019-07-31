(ns org.nd4j.linalg.lossfunctions.impl.LossMixtureDensity$MixtureDensityComponents
  "This class is a data holder for the mixture density
 components for convenient manipulation.
 These are organized as rank-3 matrices with shape
 [nSamples, nLabelsPerSample, nMixturesPerLabel]
 and refer to the 'alpha' (weight of that gaussian), 'mu' (mean for that
 gaussian), and 'sigma' (standard-deviation for that gaussian)."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.lossfunctions.impl LossMixtureDensity$MixtureDensityComponents]))

(defn ->mixture-density-components
  "Constructor."
  (^LossMixtureDensity$MixtureDensityComponents []
    (new LossMixtureDensity$MixtureDensityComponents )))

