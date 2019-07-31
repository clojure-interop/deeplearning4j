(ns org.datavec.audio.extension.NormalizedSampleAmplitudes
  "Handles the wave data in amplitude-time domain."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.audio.extension NormalizedSampleAmplitudes]))

(defn ->normalized-sample-amplitudes
  "Constructor.

  wave - `org.datavec.audio.Wave`"
  (^NormalizedSampleAmplitudes [^org.datavec.audio.Wave wave]
    (new NormalizedSampleAmplitudes wave)))

(defn get-normalized-amplitudes
  "Get normalized amplitude of each frame

  returns: array of normalized amplitudes(signed 16 bit): normalizedAmplitudes[frame]=amplitude - `double[]`"
  ([^NormalizedSampleAmplitudes this]
    (-> this (.getNormalizedAmplitudes))))

