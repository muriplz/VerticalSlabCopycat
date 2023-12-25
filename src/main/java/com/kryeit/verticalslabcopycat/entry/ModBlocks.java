package com.kryeit.verticalslabcopycat.entry;

import com.kryeit.verticalslabcopycat.VerticalSlabCopycat;
import com.kryeit.verticalslabcopycat.content.copycat.VerticalSlabCopycatBlock;
import com.kryeit.verticalslabcopycat.content.copycat.VerticalSlabCopycatModel;
import com.simibubi.create.foundation.data.BuilderTransformers;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.BlockEntry;

import static com.kryeit.verticalslabcopycat.VerticalSlabCopycat.REGISTRATE;
import static com.simibubi.create.foundation.data.ModelGen.customItemModel;

public class ModBlocks {

	public static final BlockEntry<VerticalSlabCopycatBlock> VERTICAL_SLAB_COPYCAT =
			REGISTRATE.block("copycat_vertical_slab", VerticalSlabCopycatBlock::new)
					.transform(BuilderTransformers.copycat())
					.onRegister(CreateRegistrate.blockModel(() -> VerticalSlabCopycatModel::new))
					.item()
					.transform(customItemModel("copycat_base", "vertical_slab"))
					.register();

	public static void register() {
	}
}
