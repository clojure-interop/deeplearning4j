(ns org.nd4j.linalg.api.ops.impl.transforms.segment.SegmentProd
  "Segment product operation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms.segment SegmentProd]))

(defn ->segment-prod
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  data - `org.nd4j.autodiff.samediff.SDVariable`
  segment-ids - `org.nd4j.autodiff.samediff.SDVariable`"
  (^SegmentProd [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable data ^org.nd4j.autodiff.samediff.SDVariable segment-ids]
    (new SegmentProd same-diff data segment-ids))
  (^SegmentProd []
    (new SegmentProd )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^SegmentProd this]
    (-> this (.opName))))

