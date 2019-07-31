(ns org.deeplearning4j.arbiter.optimize.distribution.DistributionUtils
  "Distribution utils for Apache Commons math distributions - which don't provide equals, hashcode, toString methods,
 don't implement serializable etc.
 Which makes unit testing etc quite difficult."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.optimize.distribution DistributionUtils]))

(defn *distributions-equal
  "a - `org.apache.commons.math3.distribution.RealDistribution`
  b - `org.apache.commons.math3.distribution.RealDistribution`

  returns: `boolean`"
  (^Boolean [^org.apache.commons.math3.distribution.RealDistribution a ^org.apache.commons.math3.distribution.RealDistribution b]
    (DistributionUtils/distributionsEqual a b)))

(defn *distribution-equals
  "a - `org.apache.commons.math3.distribution.IntegerDistribution`
  b - `org.apache.commons.math3.distribution.IntegerDistribution`

  returns: `boolean`"
  (^Boolean [^org.apache.commons.math3.distribution.IntegerDistribution a ^org.apache.commons.math3.distribution.IntegerDistribution b]
    (DistributionUtils/distributionEquals a b)))

