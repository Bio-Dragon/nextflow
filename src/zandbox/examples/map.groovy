/*
 * Copyright (c) 2013-2014, Centre for Genomic Regulation (CRG).
 * Copyright (c) 2013-2014, Paolo Di Tommaso and the respective authors.
 *
 *   This file is part of 'Nextflow'.
 *
 *   Nextflow is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   Nextflow is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with Nextflow.  If not, see <http://www.gnu.org/licenses/>.
 */

import nextflow.Channel

/**
 *
 *  @author Paolo Di Tommaso <paolo.ditommaso@gmail.com>
 */

Channel
        .from( 1, 2, 3, 4, 5 )
        .map { it * it  }
        .subscribe onNext: { println it }, onComplete: { println 'Done' }


Channel
        .from( 'a', 'b', 'c' )
        .mapWithIndex { it, index ->  [it, index] }
        .subscribe onNext: { println it }, onComplete: { println 'Done' }

sleep 100