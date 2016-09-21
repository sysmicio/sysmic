/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ch.doplab.spatial.distance

import scala.math._

object LatLngDistanceApprox extends Distance {

  import LatLngDistance._

  def distance(lon1: Double, lat1: Double, lon2: Double, lat2: Double): Double = {
    val x = lat1 - lat2
    val y = (lon1 - lon2) * cos(lat1)
    val distance = deglen * sqrt(x * x + y * y)
    distance
  }

}
