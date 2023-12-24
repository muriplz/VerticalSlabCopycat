package com.kryeit.verticalslabcopycat.entry;

import com.kryeit.verticalslabcopycat.VerticalSlabCopycat;
import com.simibubi.create.foundation.data.CreateRegistrate;

public class ModBlocks {
	private static final CreateRegistrate REGISTRATE = VerticalSlabCopycat.getRegistrate();


	public static final BlockEntry<VerticalSlabCopycatBlock> VERTICAL_SLAB_COPYCAT =
			REGISTRATE.block("copycat_vertical_step", CopycatVerticalStepBlock::new)
					.transform(BuilderTransformers.copycat())
					.transform(FeatureToggle.register())
					.onRegister(CreateRegistrate.blockModel(() -> CopycatVerticalStepModel::new))
					.item()
					.transform(customItemModel("copycat_base", "vertical_step"))
					.register();

	public static void register() {
	}
}
