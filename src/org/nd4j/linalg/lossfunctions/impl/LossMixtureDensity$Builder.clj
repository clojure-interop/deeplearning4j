(ns org.nd4j.linalg.lossfunctions.impl.LossMixtureDensity$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.lossfunctions.impl LossMixtureDensity$Builder]))

(defn gaussians
  "Specifies the number of gaussian functions to attempt
  fitting against the data.

  a-gaussians - Number of gaussian functions to fit. - `int`

  returns: DynamicCustomOpsBuilder. - `org.nd4j.linalg.lossfunctions.impl.LossMixtureDensity$Builder`"
  (^org.nd4j.linalg.lossfunctions.impl.LossMixtureDensity$Builder [^LossMixtureDensity$Builder this ^Integer a-gaussians]
    (-> this (.gaussians a-gaussians))))

(defn label-width
  "Specifies the width of the labels vector which also corresponds
  to the width of the 'mean' vector for each of the gaussian functions.

  a-label-width - Width of the labels vector. - `int`

  returns: DynamicCustomOpsBuilder. - `org.nd4j.linalg.lossfunctions.impl.LossMixtureDensity$Builder`"
  (^org.nd4j.linalg.lossfunctions.impl.LossMixtureDensity$Builder [^LossMixtureDensity$Builder this ^Integer a-label-width]
    (-> this (.labelWidth a-label-width))))

(defn build
  "Creates a new instance of the mixture density
  cost function.

  returns: A new mixture density cost function built with
  the specified parameters. - `org.nd4j.linalg.lossfunctions.impl.LossMixtureDensity`"
  (^org.nd4j.linalg.lossfunctions.impl.LossMixtureDensity [^LossMixtureDensity$Builder this]
    (-> this (.build))))

