package dtc.syntax

import dtc.{Lawless, Local, Zoned}

object all
  extends Local.ToLocalOps
    with Zoned.ToZonedOps
    with Lawless.ToLawlessOps
