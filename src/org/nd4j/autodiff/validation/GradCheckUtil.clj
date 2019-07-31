(ns org.nd4j.autodiff.validation.GradCheckUtil
  "Gradient check utility"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.autodiff.validation GradCheckUtil]))

(defn ->grad-check-util
  "Constructor."
  (^GradCheckUtil []
    (new GradCheckUtil )))

(defn *check-gradients
  "sd - `org.nd4j.autodiff.samediff.SameDiff`
  eps - `double`
  max-rel-error - `double`
  min-abs-error - `double`
  print - `boolean`
  exit-on-first-failure - `boolean`
  skip-validation - `boolean`
  debug-mode - `boolean`
  skip-variables - `java.util.Set`

  returns: `boolean`"
  (^Boolean [^org.nd4j.autodiff.samediff.SameDiff sd ^Double eps ^Double max-rel-error ^Double min-abs-error ^Boolean print ^Boolean exit-on-first-failure ^Boolean skip-validation ^Boolean debug-mode ^java.util.Set skip-variables]
    (GradCheckUtil/checkGradients sd eps max-rel-error min-abs-error print exit-on-first-failure skip-validation debug-mode skip-variables))
  (^Boolean [^org.nd4j.autodiff.samediff.SDVariable function ^org.nd4j.autodiff.samediff.SDVariable wrt ^Double epsilon ^Double max-rel-error ^Boolean print ^java.util.Map input-parameters]
    (GradCheckUtil/checkGradients function wrt epsilon max-rel-error print input-parameters))
  (^Boolean [^org.nd4j.autodiff.samediff.SameDiff sd ^Boolean print ^Boolean exit-on-first-failure]
    (GradCheckUtil/checkGradients sd print exit-on-first-failure))
  (^Boolean [^org.nd4j.autodiff.samediff.SameDiff sd ^java.lang.String skip-variables]
    (GradCheckUtil/checkGradients sd skip-variables))
  (^Boolean [^org.nd4j.autodiff.validation.TestCase t]
    (GradCheckUtil/checkGradients t)))

(defn *validate-internal-state
  "sd - `org.nd4j.autodiff.samediff.SameDiff`
  generate-and-check-grad-fn - `boolean`"
  ([^org.nd4j.autodiff.samediff.SameDiff sd ^Boolean generate-and-check-grad-fn]
    (GradCheckUtil/validateInternalState sd generate-and-check-grad-fn)))

